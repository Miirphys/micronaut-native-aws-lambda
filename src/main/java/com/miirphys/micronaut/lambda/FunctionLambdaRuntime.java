package com.miirphys.micronaut.lambda;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import io.micronaut.function.aws.runtime.AbstractMicronautLambdaRuntime;

import java.net.MalformedURLException;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import io.micronaut.core.annotation.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FunctionLambdaRuntime extends AbstractMicronautLambdaRuntime<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent, APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    private static final Logger __LOGGER = LoggerFactory.getLogger(FunctionLambdaRuntime.class);

    public static void main(String[] args) {

        try {

            new FunctionLambdaRuntime().run(args);

        } catch (MalformedURLException malformedURLException) {

            __LOGGER.info(malformedURLException.getMessage());

        }

    }

    @Override
    @Nullable
    protected RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> createRequestHandler(String... args) {

        return new FunctionRequestHandler();

    }

}
