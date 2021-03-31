package com.coroda.util;

public class Constants {
    public final static String MAIN_PATH = "/product";
    public final static String ID = "/{id}";
    public final static String MODEL = "model/{model}";
    public final static String ORIGIN = "/origin/{id}";

    public final static String SUCCESS = "SUCCESS";
    public final static String ERROR = "ERROR";

    public final static String SAVE_VALUE="Metodo a traves del cual se envia la informacion del Producto que  sera registrada dentro de la base de datos";
    public final static String SAVE_NOTE="Para el registro del Producto , sera necesario el llenado de todo los campos , a excepcion de los Id´s los cuales seran generados automaticamente";
    public final static String DELETE_ID_VALUE="Metodo a traves del cual se Elimina la informacion del Producto mediante su Id ";
    public final static String DELETE_ID_NOTE="Para eliminar los  datos del Producto , sera necesario enviar el Id del Producto ";
    public final static String UPDATE_ID_VALUE="Metodo a traves del cual se Actualiza la informacion del Producto mediante su Id ";
    public final static String UPDATE_ID_NOTE="Para Actualizar los  datos de un Producto , sera necesario enviar todo el registro con los datos ya actualizados junto a sus Id`s ";
    public final static String GET_ID_VALUE="Metodo a traves del cual se Obtiene la informacion del Producto mediante su Id ";
    public final static String GET_ID_NOTE="Para la obtencion de datos de un Producto , sera necesario enviar el Id del Producto a consultar";

    public final static String GETDATA_VALUE="Metodo a traves del cual se Obtiene la informacion del Producto mediante su origen y/o modelo, ademas se puede obtener todas las operaciones registradas";
    public final static String GETDATA_NOTE="Para la obtencion de datos del Producto , sera necesario enviar el origen y/o modelo a consultar; si no se envia ninguna variable te traera todos los Producto";

}
