# MoodleClient.Model.ModDataSearchEntriesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Advsearch** | [**List&lt;ModDataSearchEntriesRequestAdvsearchInner&gt;**](ModDataSearchEntriesRequestAdvsearchInner.md) |  | [optional] 
**Databaseid** | **int** | data instance id | 
**Groupid** | **int** | Group id, 0 means that the function will determine the user group | [optional] [default to 0]
**Order** | **string** | The direction of the sorting: &#39;ASC&#39; or &#39;DESC&#39;.                                                 Empty for using the default database setting. | [optional] 
**Page** | **int** | The page of records to return. | [optional] [default to 0]
**Perpage** | **int** | The number of records to return per page | [optional] [default to 0]
**Returncontents** | **bool** | Whether to return contents or not. | [optional] [default to false]
**Search** | **string** | search string (empty when using advanced) | [optional] [default to ""]
**Sort** | **int** | Sort the records by this field id, reserved ids are:                                                 0: timeadded                                                 -1: firstname                                                 -2: lastname                                                 -3: approved                                                 -4: timemodified.                                                 Empty for using the default database setting. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

