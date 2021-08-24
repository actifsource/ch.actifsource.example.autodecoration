package ch.actifsource.example.autodecoration.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AutoDecorator extends DynamicResource implements IAutoDecorator {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAutoDecorator> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAutoDecorator>() {
    
    @Override
    public IAutoDecorator create() {
      return new AutoDecorator();
    }
    
    @Override
    public IAutoDecorator create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AutoDecorator(resourceRepository, resource);
    }
  
  };

  public AutoDecorator() {
    super(IAutoDecorator.TYPE_ID);
  }
  
  public AutoDecorator(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAutoDecorator.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationTarget selectDecorationTarget() {
    return _getSingle(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationTarget.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorator_decorationTarget);
  }

  public AutoDecorator setDecorationTarget(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationTarget decorationTarget) {
    _setSingle(ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorator_decorationTarget, decorationTarget);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public AutoDecorator setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AutoDecorator setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationTarget.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorator_decorationTarget, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator> selectToMeDecorationTarget(ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorationTarget object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.autodecoration.generic.javamodel.IAutoDecorator.class, ch.actifsource.example.autodecoration.generic.GenericPackage.AutoDecorator_decorationTarget, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c19f0d0e-04e9-11ec-8a7a-8dff86d758ba,oDsW947zJPH+2X8NxIlTGmf0FM4=] */
