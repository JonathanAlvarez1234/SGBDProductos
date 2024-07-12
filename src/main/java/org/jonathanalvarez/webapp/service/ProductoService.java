package org.jonathanalvarez.webapp.service;

import jakarta.persistence.EntityManager;
import java.util.List;
import org.jonathanalvarez.webapp.model.Producto;
import org.jonathanalvarez.webapp.util.JPAUtil;


public class ProductoService implements IProductoService{

    private EntityManager em;
    
    public ProductoService(){
        this.em = JPAUtil.getEntityManager();
    }
    
    @Override
    public List<Producto> listarProductos() {
        return em.createQuery("SELECT p FROM Producto p", Producto.class).getResultList();
    }

    @Override
    public void agregarProducto(Producto producto) {
        
    }

    @Override
    public void eliminarProducto(int productoId) {
        
    }

    @Override
    public Producto buscarProductoPorId(int productoId) {
        Producto producto = null;
            return producto;
    }

    @Override
    public void editarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
