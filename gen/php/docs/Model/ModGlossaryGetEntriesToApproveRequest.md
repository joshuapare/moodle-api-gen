# # ModGlossaryGetEntriesToApproveRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **int** | Start returning records from here | [optional] [default to 0]
**id** | **int** | Glossary entry ID |
**letter** | **string** | A letter, or either keywords: &#39;ALL&#39; or &#39;SPECIAL&#39;. |
**limit** | **int** | Number of records to return | [optional] [default to 20]
**options** | **object** |  | [optional]
**order** | **string** | Order by: &#39;CONCEPT&#39;, &#39;CREATION&#39; or &#39;UPDATE&#39; | [optional] [default to 'CONCEPT']
**sort** | **string** | The direction of the order: &#39;ASC&#39; or &#39;DESC&#39; | [optional] [default to 'ASC']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)