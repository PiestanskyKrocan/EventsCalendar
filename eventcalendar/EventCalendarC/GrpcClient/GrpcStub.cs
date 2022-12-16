// The port number must match the port of the gRPC server.

using Grpc.Net.Client;
using GrpcClient;

using var channel = GrpcChannel.ForAddress("https://localhost:6565");
var client = new GRPCUserService.GRPCUserServiceClient(channel);
var reply = await client.RPCfindUserById(
    new UserId { UserId_ = 1 });
Console.WriteLine("Greeting: " + reply.Message);
Console.WriteLine("Press any key to exit...");
Console.ReadKey();