package org.eclipse.jgit.build.test;

import java.io.IOException;
import java.nio.file.Files;

import org.eclipse.jgit.lfs.Lfs;
import org.eclipse.jgit.lib.GpgConfig.GpgFormat;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.Signer;
import org.eclipse.jgit.lib.Signers;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.eclipse.jgit.transport.SshSessionFactory;

public class Main {

  public static void main(String[] args) throws IOException {
    Repository db = FileRepositoryBuilder.create(Files.createTempDirectory("jgit-build-test").toFile());
    Lfs lfs = new Lfs(db);
    System.out.println(lfs.getLfsObjDir());

    Signer signer = Signers.get(GpgFormat.OPENPGP);
    System.out.println(signer.getClass().getCanonicalName());
    SshSessionFactory sshFactory = SshSessionFactory.getInstance();
    System.out.println(sshFactory.getClass().getCanonicalName());
  }

}
