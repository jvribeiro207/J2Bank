/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import model.*;
import controller.test.TestController;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import persistence.TestPersistence;

/**
 *
 * @author jose
 */

public class TransacaoTest {

    private TestController controller;
    private Cliente clienteOrigem;
    private Cliente clienteDestino;
    private TestPersistence testPersistence = new TestPersistence();

    @BeforeEach
    void setUp() {
        
        
        controller = new TestController();
        clienteOrigem = new Cliente("Joao", "123", "Cliente", "333.333.333-33");
        clienteOrigem.creditaSaldo(new BigDecimal("1000"));
        clienteDestino = new Cliente("Bruno", "123", "Cliente", "444.444.444-44");
        List<Cliente> listaCliente = new ArrayList<>(); 
        listaCliente.add(clienteOrigem);
        listaCliente.add(clienteDestino);
        testPersistence.save(listaCliente);
    }

    @Test
    void transferenciaComSaldoSuficiente() {
        //System.out.println(clienteOrigem.getCpf());
        //System.out.println(clienteDestino.getCpf());
        boolean resultado = controller.transferir(clienteOrigem.getCpf(), clienteDestino.getCpf(), new BigDecimal("500"));
        assertAll(
                () -> assertTrue(resultado, "Transferência deve retornar true"),
                () -> assertEquals(new BigDecimal("500"), testPersistence.buscarCliente(clienteOrigem.getCpf()).getSaldo(), "Saldo origem incorreto"),
                () -> assertEquals(new BigDecimal("500"), testPersistence.buscarCliente(clienteDestino.getCpf()).getSaldo(), "Saldo destino incorreto")
        );
    }

    @Test
    void transferenciaParaMesmaConta() {
        boolean resultado = controller.transferir(clienteOrigem.getCpf(), clienteOrigem.getCpf(), new BigDecimal("200"));
        assertFalse(resultado);
    }

    @Test
    void transferenciaComValorNegativo() {
        boolean resultado = controller.transferir(clienteOrigem.getCpf(), clienteDestino.getCpf(), new BigDecimal("-100"));
        assertFalse(resultado);
    }
    
    @Test
    void transferenciaComValorAcimaDe1M(){
        boolean resultado = controller.transferir(clienteOrigem.getCpf(), clienteDestino.getCpf(), new BigDecimal("1000002"));
        assertFalse(resultado);
    }
    
    @Test
    void saqueComValorSuficiente() {
        boolean resultado = controller.saque(clienteOrigem.getCpf(), new BigDecimal("100"));
        assertTrue(resultado);
    }
    
    @Test
    void saqueComValorInsuficiente() {
        boolean resultado = controller.saque(clienteOrigem.getCpf(), new BigDecimal("1000000"));
        assertFalse(resultado);
    }
    
    
     @Test
    void saqueComValorNegativo() {
        boolean resultado = controller.saque(clienteOrigem.getCpf(), new BigDecimal("-100"));
        assertFalse(resultado);
    }
    
    @Test
    void depositaComValorSuficiente() {
        boolean resultado = controller.deposito(clienteOrigem.getCpf(), new BigDecimal("100"));
        assertTrue(resultado);
    }
    

}
