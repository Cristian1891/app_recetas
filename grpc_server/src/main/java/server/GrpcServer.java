package server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.UsuarioService;


public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException{
        System.out.println("Iniciando servidor grpc");

        Server server = ServerBuilder.forPort(9090)
                .addService(new UsuarioService())
                .build();
        server.start();

        System.out.println("Servidor escuchando en puerto " + server.getPort());

        server.awaitTermination();
    }
}
