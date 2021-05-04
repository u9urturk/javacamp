package Services;

import Entities.Concrete.Game;

public interface GameService {
	void add(Game game);
	void delete(Game game);
	void update(Game game);
}
