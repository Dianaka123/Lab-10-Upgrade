package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.companys;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Company;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.type.TypeItProject;
import org.apache.log4j.Logger;

public class ITCompany extends Company {
    private final static Logger LOGGER;

    static {
        LOGGER = Logger.getLogger(ITCompany.class);
    }

    private static final TypeItProject DEFAULT_TYPE_PROJECT = TypeItProject.WEBSITE;
    private static final String DEFAULT_COMPANY_NAME = "ITCompany";

    private TypeItProject typeItProject;

    public ITCompany() {
        super(DEFAULT_COMPANY_NAME);
        this.typeItProject = DEFAULT_TYPE_PROJECT;
        LOGGER.debug("Initial default constructor");
    }

    public ITCompany(String nameCompany){
        super(nameCompany);
        this.typeItProject = DEFAULT_TYPE_PROJECT;
        LOGGER.debug("Constructor use only name");
    }

    public ITCompany(String name, TypeItProject typeItProject) {
        super(name);
        this.typeItProject = typeItProject;
        LOGGER.debug("Initial constructor with all parameters");
    }

    public ITCompany(ITCompany itCompany) {
        super(itCompany);
        this.typeItProject = itCompany.typeItProject;
        LOGGER.debug("Initial copy constructor");
    }


    public TypeItProject getTypeItProject() {
        LOGGER.debug("Get type Project" + typeItProject);
        return typeItProject;
    }

    public void setTypeItProject(TypeItProject typeItProject) {
        this.typeItProject = typeItProject;
        LOGGER.debug("Set type project: " + typeItProject);
    }

    @Override
    public String toString() {
        String information = "ITCompany{" +
                "typeItProject=" + typeItProject +
                '}';
        LOGGER.info(information);
        return information;
    }
}
