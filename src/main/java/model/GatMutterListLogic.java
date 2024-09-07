package model;

import java.util.List;

import dao.MuttersDAO;

public class GatMutterListLogic {
  public List<Mutter> execute() {
	  MuttersDAO dao = new MuttersDAO();
	  List<Mutter> mutterList = dao.findAll();
	  return mutterList;
  }
}
