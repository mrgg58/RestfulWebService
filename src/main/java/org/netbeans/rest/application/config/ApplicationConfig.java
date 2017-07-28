/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author mrgg
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        // following code can be used to customize Jersey 1.x JSON provider:
        try {
            Class jacksonProvider = Class.forName("org.codehaus.jackson.jaxrs.JacksonJsonProvider");
            resources.add(jacksonProvider);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(getClass().getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.mycompany.restfulwebservice.webservice.evler.sorgu.Sorgu.class);
        resources.add(org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider.class);
        resources.add(org.codehaus.jackson.jaxrs.JacksonJsonProvider.class);
        resources.add(org.codehaus.jackson.jaxrs.JsonMappingExceptionMapper.class);
        resources.add(org.codehaus.jackson.jaxrs.JsonParseExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.ClassNotFoundExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.ConversionExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.DatabaseExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.EntityExistsExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.EntityNotFoundExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.IOExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.IllegalAccessExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.IllegalArgumentExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.IllegalStateExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.InvocationTargetExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.JAXBExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.JPARSConfigurationExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.JPARSExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.MalformedURLExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.NamingExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.NoResultExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.NoSuchMethodExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.NonUniqueResultExceptionExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.OptimisticLockExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.PersistenceExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.PessimisticLockExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.QueryTimeoutExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.RollbackExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.TransactionRequiredExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.exceptions.UnsupportedMediaTypeExceptionMapper.class);
        resources.add(org.eclipse.persistence.jpa.rs.resources.EntityResource.class);
        resources.add(org.eclipse.persistence.jpa.rs.resources.PersistenceResource.class);
        resources.add(org.eclipse.persistence.jpa.rs.resources.PersistenceUnitResource.class);
        resources.add(org.eclipse.persistence.jpa.rs.resources.QueryResource.class);
        resources.add(org.eclipse.persistence.jpa.rs.resources.SingleResultQueryResource.class);
        resources.add(org.eclipse.persistence.jpa.rs.resources.unversioned.EntityResource.class);
        resources.add(org.eclipse.persistence.jpa.rs.resources.unversioned.PersistenceResource.class);
        resources.add(org.eclipse.persistence.jpa.rs.resources.unversioned.PersistenceUnitResource.class);
        resources.add(org.eclipse.persistence.jpa.rs.resources.unversioned.QueryResource.class);
        resources.add(org.eclipse.persistence.jpa.rs.resources.unversioned.SingleResultQueryResource.class);
        resources.add(org.jboss.resteasy.core.AcceptHeaderByFileSuffixFilter.class);
        resources.add(org.jboss.resteasy.core.AsynchronousDispatcher.class);
        resources.add(org.jboss.resteasy.plugins.interceptors.AcceptEncodingGZIPFilter.class);
        resources.add(org.jboss.resteasy.plugins.interceptors.GZIPDecodingInterceptor.class);
        resources.add(org.jboss.resteasy.plugins.interceptors.GZIPEncodingInterceptor.class);
        resources.add(org.jboss.resteasy.plugins.interceptors.MessageSanitizerContainerResponseFilter.class);
        resources.add(org.jboss.resteasy.plugins.providers.DataSourceProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.DefaultNumberWriter.class);
        resources.add(org.jboss.resteasy.plugins.providers.DefaultTextPlain.class);
        resources.add(org.jboss.resteasy.plugins.providers.DocumentProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.FileProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.FormUrlEncodedProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.IIOImageProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.InputStreamProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.JaxrsFormProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.ReaderProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.SerializableProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.SourceProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.StringTextStar.class);
        resources.add(org.jboss.resteasy.plugins.providers.jackson.JacksonJsonpInterceptor.class);
        resources.add(org.jboss.resteasy.plugins.providers.jackson.ResteasyJacksonProvider.class);
    }
    
}
