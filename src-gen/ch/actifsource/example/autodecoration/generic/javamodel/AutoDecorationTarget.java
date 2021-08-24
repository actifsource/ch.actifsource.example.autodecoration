package ch.actifsource.example.autodecoration.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AutoDecorationTarget extends DynamicResource implements IAutoDecorationTarget {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAutoDecorationTarget> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAutoDecorationTarget>() {
    
    @Override
    public IAutoDecorationTarget create() {
      return new AutoDecorationTarget();
    }
    
    @Override
    public IAutoDecorationTarget create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AutoDecorationTarget(resourceRepository, resource);
    }
  
  };

  public AutoDecorationTarget() {
    super(IAutoDecorationTarget.TYPE_ID);
  }
  
  public AutoDecorationTarget(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAutoDecorationTarget.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AutoDecorationTarget setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9cc3a07f-04e9-11ec-8a7a-8dff86d758ba,6RXhiUGwG8nnrJV+/IRhz6gA2E4=] */
