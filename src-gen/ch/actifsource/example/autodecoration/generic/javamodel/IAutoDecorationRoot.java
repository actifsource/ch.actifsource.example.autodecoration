package ch.actifsource.example.autodecoration.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAutoDecorationRoot extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("58de7deb-04e9-11ec-8a7a-8dff86d758ba");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator> selectNoneAutoDecorating();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator> selectAddDecorator();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator> selectRemoveDecorator();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator> selectAddRemoveDecorator();
  
  public java.util.List<? extends ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationTarget> selectTargetDefinition();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,58de7deb-04e9-11ec-8a7a-8dff86d758ba,yajw7OReefTsFEdlDTRCGgcX2K0=] */
