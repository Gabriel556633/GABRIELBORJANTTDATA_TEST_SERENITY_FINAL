package com.nttdataqa.serenity.userInterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchasePageInterface {

    public static final Target PRODUCT1 = Target.the("Select Producto1").located(By.xpath("//*[@id='tbodyid']/div[1]/div/div/h4/a"));
    public static final Target ANADIR = Target.the("Añadir Producto").located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
    public static final Target PRODUCT2 = Target.the("Select Producto2").located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a"));
    public static final Target HOME = Target.the("Ir a Home").located(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
    public static final Target GOCART = Target.the("Ir a Carro").located(By.xpath("//*[@id=\"cartur\"]"));
    public static final Target ORDER = Target.the("Boton Ordenar").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
    public static final Target NAME = Target.the("Nombre").located(By.xpath("//*[@id=\"name\"]"));
    public static final Target COUNTRY = Target.the("Pais").located(By.id("country"));
    public static final Target CITY = Target.the("Ciudad").located(By.id("city"));
    public static final Target CARD = Target.the("TarjetaCredito").located(By.xpath("//*[@id=\"card\"]"));
    public static final Target MONTH = Target.the("Mes").located(By.xpath("//*[@id=\"month\"]"));
    public static final Target YEAR = Target.the("Año").located(By.xpath("//*[@id=\"year\"]"));
    public static final Target PURCHASE = Target.the("Boton Comprar").located(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));


}
