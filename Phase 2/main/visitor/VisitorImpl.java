package main.visitor;
import main.ast.node.*;
import main.ast.node.Program;
import main.ast.node.declaration.*;
import main.ast.node.declaration.handler.*;
import main.ast.node.declaration.VarDeclaration;
import main.ast.node.expression.*;
import main.ast.node.expression.values.BooleanValue;
import main.ast.node.expression.values.IntValue;
import main.ast.node.expression.values.StringValue;
import main.ast.node.statement.*;

public class VisitorImpl implements Visitor {

    @Override
    public void visit(Program program) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(ActorDeclaration actorDeclaration) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(HandlerDeclaration handlerDeclaration) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(VarDeclaration varDeclaration) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Main mainActors) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(ActorInstantiation actorInstantiation) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(UnaryExpression unaryExpression) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(BinaryExpression binaryExpression) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(ArrayCall arrayCall) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(ActorVarAccess actorVarAccess) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Identifier identifier) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Self self) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Sender sender) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(BooleanValue value) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(IntValue value) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(StringValue value) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Block block) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Conditional conditional) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(For loop) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Break breakLoop) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Continue continueLoop) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(MsgHandlerCall msgHandlerCall) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Print print) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Assign assign) {
        //TODO: implement appropriate visit functionality
    }
}
