package php.graphic.lwjgl;

import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.lang.BaseObject;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

import org.lwjgl.Version;

@Reflection.Name("Version")
@Reflection.Namespace(LWJGLExtension.NS)
public class LWJGL extends BaseObject {
    public LWJGL(Environment env) {
        super(env);
    }

    protected LWJGL(ClassEntity entity) {
        super(entity);
    }

    public LWJGL(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public static String getVersion() {
      return Version.getVersion();
    }
}
