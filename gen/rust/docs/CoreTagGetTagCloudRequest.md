# CoreTagGetTagCloudRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ctx** | Option<**i32**> | Only retrieve tag instances in this context. | [optional][default to 0]
**fromctx** | Option<**i32**> | Context id where this tag cloud is displayed. | [optional][default to 0]
**isstandard** | Option<**bool**> | Whether to return only standard tags. | [optional][default to false]
**limit** | Option<**i32**> | Maximum number of tags to retrieve. | [optional][default to 150]
**rec** | Option<**i32**> | Retrieve tag instances in the $ctx context and it's children. | [optional][default to 1]
**search** | Option<**String**> | Search string. | [optional][default to ]
**sort** | Option<**String**> | Sort order for display                     (id, name, rawname, count, flag, isstandard, tagcollid). | [optional][default to name]
**tagcollid** | Option<**i32**> | Tag collection id. | [optional][default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


