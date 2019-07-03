/*
 * Copyright 2015-2019 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package org.junit.jupiter.api.extension;

import static org.apiguardian.api.API.Status.EXPERIMENTAL;

import org.apiguardian.api.API;

/**
 * Thrown if an error is encountered while evaluating a script-based
 * {@link ExecutionCondition}.
 *
 * @since 5.1
 */
@API(status = EXPERIMENTAL, since = "5.1")
public class ScriptEvaluationException extends ExtensionConfigurationException {

	private static final long serialVersionUID = 1L;

	public ScriptEvaluationException(String message) {
		super(message);
	}

	public ScriptEvaluationException(String message, Throwable cause) {
		super(message, cause);
	}

}
