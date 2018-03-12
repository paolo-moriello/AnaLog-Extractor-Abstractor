import it.unisannio.loganalysis.extractor.model.model.Action;
import it.unisannio.loganalysis.extractor.model.model.Model;
import it.unisannio.loganalysis.extractor.model.model.Resource;
import it.unisannio.loganalysis.extractor.model.model.User;

/**
 * Created by paolomoriello on 29/06/16.
 */
public interface ILogHandler {
    Model buildModel();
}
