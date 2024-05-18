

# ModDataSearchEntriesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**advsearch** | [**List&lt;ModDataSearchEntriesRequestAdvsearchInner&gt;**](ModDataSearchEntriesRequestAdvsearchInner.md) |  |  [optional] |
|**databaseid** | **Integer** | data instance id |  |
|**groupid** | **Integer** | Group id, 0 means that the function will determine the user group |  [optional] |
|**order** | **String** | The direction of the sorting: &#39;ASC&#39; or &#39;DESC&#39;.                                                 Empty for using the default database setting. |  [optional] |
|**page** | **Integer** | The page of records to return. |  [optional] |
|**perpage** | **Integer** | The number of records to return per page |  [optional] |
|**returncontents** | **Boolean** | Whether to return contents or not. |  [optional] |
|**search** | **String** | search string (empty when using advanced) |  [optional] |
|**sort** | **Integer** | Sort the records by this field id, reserved ids are:                                                 0: timeadded                                                 -1: firstname                                                 -2: lastname                                                 -3: approved                                                 -4: timemodified.                                                 Empty for using the default database setting. |  [optional] |



