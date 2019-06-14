package org.eclipse.jgit.build.test;

import java.io.IOException;

import org.eclipse.jgit.attributes.AttributesNodeProvider;
import org.eclipse.jgit.lib.BaseRepositoryBuilder;
import org.eclipse.jgit.lib.ObjectDatabase;
import org.eclipse.jgit.lib.RefDatabase;
import org.eclipse.jgit.lib.ReflogReader;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.StoredConfig;

public class TestRepository extends Repository {

  protected TestRepository(BaseRepositoryBuilder options) {
    super(options);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void create(boolean bare) throws IOException {
    // TODO Auto-generated method stub
    
  }

  @Override
  public ObjectDatabase getObjectDatabase() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public RefDatabase getRefDatabase() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public StoredConfig getConfig() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public AttributesNodeProvider createAttributesNodeProvider() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void scanForRepoChanges() throws IOException {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void notifyIndexChanged(boolean internal) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public ReflogReader getReflogReader(String refName) throws IOException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getIdentifier() {
    // TODO Auto-generated method stub
    return null;
  }

}
