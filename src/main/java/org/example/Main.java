package org.example;
import org.example.entities.*;
import org.example.entities.enums.Estado;
import org.example.entities.enums.FormaPago;
import org.example.entities.enums.TipoEnvio;
import org.example.entities.enums.TipoPromocion;

import java.time.LocalDate;
import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {

        LocalTime horaFija = LocalTime.of(14, 30);  // 14:30
        LocalDate fechaFija = LocalDate.of(2025, 5, 23); // 23 de mayo de 2025
        
        UnidadMedida kilogramo = UnidadMedida.builder()
                .denominacion("Kilogramos - Kg")
                .build();
        UnidadMedida gramo = UnidadMedida.builder()
                .denominacion("Gramos - gr")
                .build();

        UnidadMedida litro = UnidadMedida.builder()
                .denominacion("Litros - L")
                .build();

        UnidadMedida mililitro = UnidadMedida.builder()
                .denominacion("Mililitro - ml")
                .build();

        Empresa empresa = Empresa.builder()
                .nombre("Marin")
                .razonSocial("R.I.")
                .cuil(2045361934)
                .build();
        Pais pais = Pais.builder()
                .nombre("Argentina")
                .build();
        Provincia provincia1 = Provincia.builder()
                .nombre("Mendoza")
                .pais(pais)
                .build();
        Localidad localidad1 = Localidad.builder()
                .nombre("Guaymallen")
                .provincia(provincia1)
                .build();
        Localidad localidad2 = Localidad.builder()
                .nombre("Godoy Cruz")
                .provincia(provincia1)
                .build();
        Domicilio domicilio1 = Domicilio.builder()
                .calle("NombreCalle1")
                .numero(1001)
                .cp(5519)
                .localidad(localidad1)
                .build();
        Domicilio domicilio2 = Domicilio.builder()
                .calle("NombreCalle2")
                .numero(2002)
                .cp(5501)
                .localidad(localidad2)
                .build();

        Sucursal sucursal1 = Sucursal.builder()
                .nombre("Byts&BitesHamburguesas")
                .domicilio(domicilio1)
                .horarioApertura(LocalTime.of(13,30))
                .horarioCierre(LocalTime.of(23,30))
                .build();

        Categoria hamburguesas = Categoria.builder()
                .denominacion("Hamburguesas")
                .build();
        Categoria dobleQueso = Categoria.builder()
                .denominacion("Hamburguesa doble queso")
                .build();

        Categoria dobleHuevo = Categoria.builder()
                .denominacion("Hamburguesa doble huevo")
                .build();

        hamburguesas.agregarSubCategoria(dobleQueso);
        hamburguesas.agregarSubCategoria(dobleHuevo);

        Imagen imagenQueso = Imagen.builder()
                .denominacion("FotoQueso")
                .build();
        Imagen imagenCarme = Imagen.builder()
                .denominacion("FotoCarne")
                .build();

        ArticuloInsumo queso = ArticuloInsumo.builder()
                .denominacion("Queso Cheddar")
                .precioVenta(1000)
                .precioCompra(500)
                .stockActual(100)
                .stockMaximo(500)
                .esParaElaborar(true)
                .unidadMedida(gramo)
                .build();
        ArticuloInsumo carne = ArticuloInsumo.builder()
                .denominacion("Medallon de Carne")
                .precioVenta(1000)
                .precioCompra(500)
                .stockActual(100)
                .stockMaximo(500)
                .esParaElaborar(true)
                .unidadMedida(gramo)
                .build();

        queso.agregarImagen(imagenQueso);
        carne.agregarImagen(imagenCarme);

        ArticuloManufacturadoDetalle cantQueso = ArticuloManufacturadoDetalle.builder()
                .cantidad(2)
                .articuloInsumo(queso)
                .build();
        ArticuloManufacturadoDetalle cantCarne = ArticuloManufacturadoDetalle.builder()
                .cantidad(2)
                .articuloInsumo(carne)
                .build();

        ArticuloManufacturado hambDobleQueso = ArticuloManufacturado.builder()
                .denominacion("Hamburguesa de Doble Queso")
                .precioVenta(9500)
                .descripcion("Hamburguesa con dos medallones de salsa, doble quesoMuzza y aderezos.")
                .tiempoEstimadoMinutos(15)
                .preparacion("Se cocinan los medallones en la plancha, se agrega el quesoMuzza, se ponen en el pan y se agregan los aderezos.")
                .build();
        Imagen fotoHambDobleQueso = Imagen.builder()
                .denominacion("Foto Hamburguesa de Doble Queso")
                .build();
        hambDobleQueso.agregarImagen(fotoHambDobleQueso);

        Promocion dosPorUnoHambDobleQueso = Promocion.builder()
                .denominacion("2 Hamburguesas al Precio de Unas")
                .fechaDesde(LocalDate.of(2025,5,23))
                .fechaHasta(LocalDate.of(2025,8,23))
                .horaDesde(LocalTime.of(10,40))
                .horaHasta(LocalTime.of(12,00))
                .descripcionDescuento("Pagando por una hamburguesa doble quesoMuzza te llevas otra de regalo.")
                .precioPromocional(9500.0)
                .tipoPromocion(TipoPromocion.HAPPYHOUR)
                .build();
        dosPorUnoHambDobleQueso.agregarArticulo(hambDobleQueso);
        Imagen imagen2x1HambDobleQueso = Imagen.builder()
                .denominacion("Imagen promocion 2x1 hamburguesa.")
                .build();
        dosPorUnoHambDobleQueso.agregarImagen(imagen2x1HambDobleQueso);

        sucursal1.agregarPromocion(dosPorUnoHambDobleQueso);

        sucursal1.agregarCategoria(hamburguesas);
        dobleQueso.agregarArticulo(hambDobleQueso);
        hambDobleQueso.agregarArticuloManufacturadoDetalle(cantQueso);
        hambDobleQueso.agregarArticuloManufacturadoDetalle(cantCarne);


        // Sucursal 2

        Sucursal sucursal2 = Sucursal.builder()
                .nombre("Byts&BitesPizzas")
                .domicilio(domicilio2)
                .horarioApertura(LocalTime.of(13,30))
                .horarioCierre(LocalTime.of(23,30))
                .build();

        Categoria pizza = Categoria.builder()
                .denominacion("Pizza")
                .build();
        Categoria muzzarella = Categoria.builder()
                .denominacion("Pizza Muzzarella")
                .build();

        Categoria fugazzeta = Categoria.builder()
                .denominacion("Fugazzeta")
                .build();

        pizza.agregarSubCategoria(muzzarella);
        pizza.agregarSubCategoria(fugazzeta);

        Imagen imagenMuzzarella = Imagen.builder()
                .denominacion("FotoMuzzarella")
                .build();
        Imagen imagenSalsa = Imagen.builder()
                .denominacion("FotoSalsa")
                .build();

        ArticuloInsumo quesoMuzza = ArticuloInsumo.builder()
                .denominacion("Queso Muzzarella")
                .precioVenta(1000)
                .precioCompra(500)
                .stockActual(100)
                .stockMaximo(500)
                .esParaElaborar(true)
                .unidadMedida(gramo)
                .build();


        ArticuloInsumo salsa = ArticuloInsumo.builder()
                .denominacion("Salsa para Pizza")
                .precioVenta(1000)
                .precioCompra(500)
                .stockActual(100)
                .stockMaximo(500)
                .esParaElaborar(true)
                .unidadMedida(mililitro)
                .build();

        quesoMuzza.agregarImagen(imagenMuzzarella);
        salsa.agregarImagen(imagenSalsa);

        ArticuloManufacturadoDetalle cantQuesoMuzza = ArticuloManufacturadoDetalle.builder()
                .cantidad(10)
                .articuloInsumo(quesoMuzza)
                .build();

        ArticuloManufacturadoDetalle cantSalsa = ArticuloManufacturadoDetalle.builder()
                .cantidad(250)
                .articuloInsumo(salsa)
                .build();

        ArticuloManufacturado pizzaMuzzarella = ArticuloManufacturado.builder()
                .denominacion("Pizza Muzzarella")
                .precioVenta(9500)
                .descripcion("Nuesta famosa pizza con el mejor queso Muzzarella.")
                .tiempoEstimadoMinutos(15)
                .preparacion("Se cocina la masa en el horno, se agrega la salsa y el queso muzzarela. Vuelve al horno por 5 minutos.")
                .build();
        Imagen fotoPizzaMuzzarella = Imagen.builder()
                .denominacion("Foto de Pizza Muzzarella")
                .build();
        pizzaMuzzarella.agregarImagen(fotoPizzaMuzzarella);

        Promocion dosPorUnoMuzzarella = Promocion.builder()
                .denominacion("2 Pizzas de Muzzarella por el precio de 1")
                .fechaDesde(LocalDate.of(2025,5,23))
                .fechaHasta(LocalDate.of(2025,6,25))
                .horaDesde(LocalTime.of(14,0))
                .horaHasta(LocalTime.of(23,59))
                .descripcionDescuento("Comprando una Pizza Muzzarella te llevas otra de regalo!!!")
                .precioPromocional(9500.00)
                .tipoPromocion(TipoPromocion.HAPPYHOUR)
                .build();
        dosPorUnoMuzzarella.agregarArticulo(pizzaMuzzarella);


        Imagen imagen2x1Muzzarella = Imagen.builder()
                .denominacion("Imagen promocion 2x1 Muzzarellas.")
                .build();
        dosPorUnoMuzzarella.agregarImagen(imagen2x1Muzzarella);

        sucursal2.agregarPromocion(dosPorUnoMuzzarella);
        sucursal2.agregarCategoria(pizza);

        muzzarella.agregarArticulo(pizzaMuzzarella);
        pizzaMuzzarella.agregarArticuloManufacturadoDetalle(cantQuesoMuzza);
        pizzaMuzzarella.agregarArticuloManufacturadoDetalle(cantSalsa);

        empresa.agregarSucursal(sucursal1);
        empresa.agregarSucursal(sucursal2);
        System.out.println(empresa);

        Factura facturaCompra  = Factura.builder()
                .fechaFacturacion(LocalDate.now())
                .mpPaymetiId(1)
                .mpMechantOrderId(1)
                .mpPreferenceId("1")
                .mpPaymentType("1")
                .formaPago(FormaPago.EFECTIVO)
                .totalVenta(10500.0)
                .build();

        Usuario user1 = Usuario.builder()
                .auth0Id("1ASD1ASD")
                .username("agmarin1")
                .build();
        ImagenCliente imagenCliente = ImagenCliente.builder()
                .denominacion("Imagen Cliente")
                .build();
               
        Localidad localidad3 = Localidad.builder()
                .nombre("Ciudad")
                .provincia(provincia1)
                .build();

        Domicilio dom3 = Domicilio.builder()
                .calle("San Martin")
                .numero(1200)
                .cp(5500)
                .localidad(localidad3)
                .build();

        Cliente cliente1 = Cliente.builder()
                .nombre("Agustin")
                .apellido("Marin")
                .telefono("2612124141")
                .email("amarin@gmail.com")
                .fechaNacimiento(LocalDate.of(2004,01,10))
                .usuario(user1)
                .imagen(imagenCliente)
                .domicilio(dom3)
                .build();

        DetallePedido detallePedido1 = DetallePedido.builder()
                .cantidad(1)
                .subTotal(9500.00)
                .articulo(hambDobleQueso)
                .build();

        Pedido pedido1 = Pedido.builder()
                .horaEstimadaFinalizacion(LocalTime.of(0,30))
                .total(10500.0)
                .totalCosto(5000.0)
                .estado(Estado.PREPARACION)
                .tipoEnvio(TipoEnvio.DELIVERY)
                .formaPago(FormaPago.EFECTIVO)
                .fechaPedido(LocalDate.now())
                .sucursal(sucursal1)
                .domicilio(dom3)
                .factura(facturaCompra)
                .build();
        pedido1.agregarDetalleAlPedido(detallePedido1);

        cliente1.agregarPedido(pedido1);

        System.out.println(cliente1);

    }
}