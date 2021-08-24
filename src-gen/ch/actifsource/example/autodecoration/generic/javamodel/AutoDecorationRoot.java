package ch.actifsource.example.autodecoration.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AutoDecorationRoot extends DynamicResource implements IAutoDecorationRoot {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAutoDecorationRoot> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAutoDecorationRoot>() {
    
    @Override
    public IAutoDecorationRoot create() {
      return new AutoDecorationRoot();
    }
    
    @Override
    public IAutoDecorationRoot create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AutoDecorationRoot(resourceRepository, resource);
    }
  
  };

  public AutoDecorationRoot() {
    super(IAutoDecorationRoot.TYPE_ID);
  }
  
  public AutoDecorationRoot(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAutoDecorationRoot.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator> selectAddDecorator() {
    return _getMap(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_addDecorator);
  }

  public AutoDecorationRoot setAddDecorator(java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator> addDecorator) {
    _setMap(ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_addDecorator, addDecorator);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator> selectAddRemoveDecorator() {
    return _getMap(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_addRemoveDecorator);
  }

  public AutoDecorationRoot setAddRemoveDecorator(java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator> addRemoveDecorator) {
    _setMap(ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_addRemoveDecorator, addRemoveDecorator);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator> selectNoneAutoDecorating() {
    return _getMap(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_noneAutoDecorating);
  }

  public AutoDecorationRoot setNoneAutoDecorating(java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator> noneAutoDecorating) {
    _setMap(ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_noneAutoDecorating, noneAutoDecorating);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator> selectRemoveDecorator() {
    return _getMap(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_removeDecorator);
  }

  public AutoDecorationRoot setRemoveDecorator(java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator> removeDecorator) {
    _setMap(ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_removeDecorator, removeDecorator);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationTarget> selectTargetDefinition() {
    return _getList(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationTarget.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_targetDefinition);
  }

  public AutoDecorationRoot setTargetDefinition(java.util.List<? extends ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationTarget> targetDefinition) {
    _setList(ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_targetDefinition, targetDefinition);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AutoDecorationRoot setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptMap(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_addDecorator, visitor);
    _acceptMap(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_addRemoveDecorator, visitor);
    _acceptMap(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_noneAutoDecorating, visitor);
    _acceptMap(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_removeDecorator, visitor);
    _acceptList(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationTarget.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_targetDefinition, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationRoot selectToMeNoneAutoDecorating(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationRoot.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_noneAutoDecorating, object.getResource());
  }
  
  public static ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationRoot selectToMeAddDecorator(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationRoot.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_addDecorator, object.getResource());
  }
  
  public static ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationRoot selectToMeRemoveDecorator(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationRoot.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_removeDecorator, object.getResource());
  }
  
  public static ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationRoot selectToMeAddRemoveDecorator(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationRoot.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_addRemoveDecorator, object.getResource());
  }
  
  public static ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationRoot selectToMeTargetDefinition(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationTarget object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationRoot.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorationRoot_targetDefinition, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,58de7deb-04e9-11ec-8a7a-8dff86d758ba,enpZ1g8bJ/K6dNRiuSA6p5syn6I=] */
