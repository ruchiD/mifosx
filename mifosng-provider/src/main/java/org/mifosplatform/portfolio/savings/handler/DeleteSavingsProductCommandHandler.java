package org.mifosplatform.portfolio.savings.handler;

import org.mifosplatform.commands.handler.NewCommandSourceHandler;
import org.mifosplatform.infrastructure.core.api.JsonCommand;
import org.mifosplatform.infrastructure.core.data.CommandProcessingResult;
import org.mifosplatform.portfolio.savings.service.SavingsProductWritePlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteSavingsProductCommandHandler implements NewCommandSourceHandler {

    private final SavingsProductWritePlatformService savingProductWritePlatformService;

    @Autowired
    public DeleteSavingsProductCommandHandler(final SavingsProductWritePlatformService savingProductWritePlatformService) {
        this.savingProductWritePlatformService = savingProductWritePlatformService;
    }

    @Override
    public CommandProcessingResult processCommand(final JsonCommand command) {
        return this.savingProductWritePlatformService.delete(command.entityId());
    }
}