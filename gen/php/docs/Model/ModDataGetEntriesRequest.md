# # ModDataGetEntriesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**databaseid** | **int** | data instance id |
**groupid** | **int** | Group id, 0 means that the function will determine the user group | [optional] [default to 0]
**order** | **string** | The direction of the sorting: &#39;ASC&#39; or &#39;DESC&#39;.                                                 Empty for using the default database setting. | [optional] [default to 'null']
**page** | **int** | The page of records to return. | [optional] [default to 0]
**perpage** | **int** | The number of records to return per page | [optional] [default to 0]
**returncontents** | **bool** | Whether to return contents or not. This will return each entry                                                         raw contents and the complete list view (using the template). | [optional] [default to false]
**sort** | **int** | Sort the records by this field id, reserved ids are:                                                 0: timeadded                                                 -1: firstname                                                 -2: lastname                                                 -3: approved                                                 -4: timemodified.                                                 Empty for using the default database setting. | [optional] [default to null]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
