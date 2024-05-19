# # ModFeedbackGetItems200ResponseItemsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependitem** | **int** | The item id this item depend on. | [optional] [default to 0]
**dependvalue** | **string** | The depend value. | [optional]
**feedback** | **int** | The feedback instance id this records belongs to. | [optional] [default to 0]
**hasvalue** | **int** | Whether it has a value or not. | [optional] [default to 0]
**id** | **int** | The record id. | [optional]
**itemfiles** | [**\OpenAPI\Client\Model\ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner[]**](ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md) |  | [optional]
**itemnumber** | **int** | The item position number | [optional]
**label** | **string** | The item label. | [optional]
**name** | **string** | The item name. | [optional]
**options** | **string** | Different additional settings for the item (question). | [optional]
**otherdata** | **string** | Additional data that may be required by external functions | [optional]
**position** | **int** | The position in the list of questions. | [optional] [default to 0]
**presentation** | **string** | The text describing the item or the available possible answers. | [optional]
**required** | **bool** | Whether is a item (question) required or not. | [optional] [default to 0]
**template** | **int** | If it belogns to a template, the template id. | [optional] [default to 0]
**typ** | **string** | The type of the item. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
