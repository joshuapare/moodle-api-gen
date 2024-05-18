# Org.OpenAPITools.Model.ModAssignGetAssignments200ResponseWarningsInner
warning

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Item** | **string** | item can be &#39;course&#39; (errorcode 1 or 2) or &#39;module&#39; (errorcode 1) | [optional] [default to "null"]
**Itemid** | **int** | When item is a course then itemid is a course id. When the item is a module then itemid is a module id | [optional] [default to null]
**Message** | **string** | untranslated english message to explain the warning | [optional] 
**Warningcode** | **string** | errorcode can be 1 (no access rights) or 2 (not enrolled or no permissions) | [optional] [default to "null"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

