# Org.OpenAPITools.Model.ModFeedbackGetItems200ResponseItemsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Dependitem** | **int** | The item id this item depend on. | [optional] [default to 0]
**Dependvalue** | **string** | The depend value. | [optional] 
**Feedback** | **int** | The feedback instance id this records belongs to. | [optional] [default to 0]
**Hasvalue** | **int** | Whether it has a value or not. | [optional] [default to 0]
**Id** | **int** | The record id. | [optional] 
**Itemfiles** | [**List&lt;ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner&gt;**](ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md) |  | [optional] 
**Itemnumber** | **int** | The item position number | [optional] 
**Label** | **string** | The item label. | [optional] 
**Name** | **string** | The item name. | [optional] 
**Options** | **string** | Different additional settings for the item (question). | [optional] 
**Otherdata** | **string** | Additional data that may be required by external functions | [optional] 
**Position** | **int** | The position in the list of questions. | [optional] [default to 0]
**Presentation** | **string** | The text describing the item or the available possible answers. | [optional] 
**Required** | **bool** | Whether is a item (question) required or not. | [optional] [default to 0]
**Template** | **int** | If it belogns to a template, the template id. | [optional] [default to 0]
**Typ** | **string** | The type of the item. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

