package openblocks.client.renderer;

import openblocks.OpenBlocks;
import openmods.renderer.BlockRenderingHandlerBase;

public class BlockRenderingHandler extends BlockRenderingHandlerBase {

	public BlockRenderingHandler() {
		addRenderer(OpenBlocks.Blocks.path, new BlockPathRenderer());
		BlockCanvasRenderer canvasRenderer = new BlockCanvasRenderer();
		addRenderer(OpenBlocks.Blocks.canvas, canvasRenderer);
		addRenderer(OpenBlocks.Blocks.canvasGlass, canvasRenderer);
		addRenderer(OpenBlocks.Blocks.paintCan, new BlockPaintCanRenderer());
		addRenderer(OpenBlocks.Blocks.radio, new BlockRadioRenderer());
	}

	@Override
	public int getRenderId() {
		return OpenBlocks.renderId;
	}
}
