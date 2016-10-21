package smartzkclient;

/**
 * Created by Sophie on 17/10/2016.
 * This interface contains all agreements between Monitor, InstanceManager and Orchestrator.
 */
public interface ApplicationResources {
    String appName = "query";
    String instanceManagerRootZnode = "instanceManagerRoot";
    String orchestratorRootZnode = "orchestratorRoot";
    String instanceManagerRootShadowZnode = "instanceManagerRootShadow";
    String orchestratorRootShadowZnode = "orchestratorRootShadow";
    String INSTANCE_MANAGER_STARTING = "starting";
    String INSTANCE_MANAGER_SHUTDOWN = "shutdown";
    String INSTANCE_MANAGER_FAIL = "fail";
}
