# # ModDataSearchEntriesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advsearch** | [**\OpenAPI\Client\Model\ModDataSearchEntriesRequestAdvsearchInner[]**](ModDataSearchEntriesRequestAdvsearchInner.md) |  | [optional]
**databaseid** | **int** | data instance id |
**groupid** | **int** | Group id, 0 means that the function will determine the user group | [optional] [default to 0]
**order** | **string** | The direction of the sorting: &#39;ASC&#39; or &#39;DESC&#39;.                                                 Empty for using the default database setting. | [optional]
**page** | **int** | The page of records to return. | [optional] [default to 0]
**perpage** | **int** | The number of records to return per page | [optional] [default to 0]
**returncontents** | **bool** | Whether to return contents or not. | [optional] [default to false]
**search** | **string** | search string (empty when using advanced) | [optional] [default to '']
**sort** | **int** | Sort the records by this field id, reserved ids are:                                                 0: timeadded                                                 -1: firstname                                                 -2: lastname                                                 -3: approved                                                 -4: timemodified.                                                 Empty for using the default database setting. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
