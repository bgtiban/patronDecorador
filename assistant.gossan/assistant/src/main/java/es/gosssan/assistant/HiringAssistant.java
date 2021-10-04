package es.gosssan.assistant;

import java.util.List;

public interface HiringAssistant {

	List<String> searchMinimalAmount();
	
	void add(Service service);
}
