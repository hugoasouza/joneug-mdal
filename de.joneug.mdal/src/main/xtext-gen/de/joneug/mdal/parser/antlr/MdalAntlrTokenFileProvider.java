/*
 * generated by Xtext 2.21.0
 */
package de.joneug.mdal.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MdalAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/joneug/mdal/parser/antlr/internal/InternalMdal.tokens");
	}
}
