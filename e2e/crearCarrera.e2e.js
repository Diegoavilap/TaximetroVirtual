describe('Crear Carrera', function() {
    it('debe crear carrera', function() {
        browser.get('http://localhost:3002/carrera/crear');

        let input_cliente_id = element(by.id('cliente_id'));
        let btn_crear_carrera = element(by.id('crear_carrera'));

        input_cliente_id.sendKeys("1");
        btn_crear_carrera.click();
        
        expect(element(by.id('msg_iniciar_carrera')).getText()).toEqual("Su Carrera a iniciado, ¡Que tenga buen Viaje!");

    });

});