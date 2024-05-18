# ModDataSearchEntriesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Advsearch** | Pointer to [**[]ModDataSearchEntriesRequestAdvsearchInner**](ModDataSearchEntriesRequestAdvsearchInner.md) |  | [optional] 
**Databaseid** | **int32** | data instance id | 
**Groupid** | Pointer to **int32** | Group id, 0 means that the function will determine the user group | [optional] [default to 0]
**Order** | Pointer to **string** | The direction of the sorting: &#39;ASC&#39; or &#39;DESC&#39;.                                                 Empty for using the default database setting. | [optional] 
**Page** | Pointer to **int32** | The page of records to return. | [optional] [default to 0]
**Perpage** | Pointer to **int32** | The number of records to return per page | [optional] [default to 0]
**Returncontents** | Pointer to **bool** | Whether to return contents or not. | [optional] [default to false]
**Search** | Pointer to **string** | search string (empty when using advanced) | [optional] [default to ""]
**Sort** | Pointer to **int32** | Sort the records by this field id, reserved ids are:                                                 0: timeadded                                                 -1: firstname                                                 -2: lastname                                                 -3: approved                                                 -4: timemodified.                                                 Empty for using the default database setting. | [optional] 

## Methods

### NewModDataSearchEntriesRequest

`func NewModDataSearchEntriesRequest(databaseid int32, ) *ModDataSearchEntriesRequest`

NewModDataSearchEntriesRequest instantiates a new ModDataSearchEntriesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataSearchEntriesRequestWithDefaults

`func NewModDataSearchEntriesRequestWithDefaults() *ModDataSearchEntriesRequest`

NewModDataSearchEntriesRequestWithDefaults instantiates a new ModDataSearchEntriesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdvsearch

`func (o *ModDataSearchEntriesRequest) GetAdvsearch() []ModDataSearchEntriesRequestAdvsearchInner`

GetAdvsearch returns the Advsearch field if non-nil, zero value otherwise.

### GetAdvsearchOk

`func (o *ModDataSearchEntriesRequest) GetAdvsearchOk() (*[]ModDataSearchEntriesRequestAdvsearchInner, bool)`

GetAdvsearchOk returns a tuple with the Advsearch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdvsearch

`func (o *ModDataSearchEntriesRequest) SetAdvsearch(v []ModDataSearchEntriesRequestAdvsearchInner)`

SetAdvsearch sets Advsearch field to given value.

### HasAdvsearch

`func (o *ModDataSearchEntriesRequest) HasAdvsearch() bool`

HasAdvsearch returns a boolean if a field has been set.

### GetDatabaseid

`func (o *ModDataSearchEntriesRequest) GetDatabaseid() int32`

GetDatabaseid returns the Databaseid field if non-nil, zero value otherwise.

### GetDatabaseidOk

`func (o *ModDataSearchEntriesRequest) GetDatabaseidOk() (*int32, bool)`

GetDatabaseidOk returns a tuple with the Databaseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatabaseid

`func (o *ModDataSearchEntriesRequest) SetDatabaseid(v int32)`

SetDatabaseid sets Databaseid field to given value.


### GetGroupid

`func (o *ModDataSearchEntriesRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModDataSearchEntriesRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModDataSearchEntriesRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModDataSearchEntriesRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetOrder

`func (o *ModDataSearchEntriesRequest) GetOrder() string`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *ModDataSearchEntriesRequest) GetOrderOk() (*string, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *ModDataSearchEntriesRequest) SetOrder(v string)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *ModDataSearchEntriesRequest) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### GetPage

`func (o *ModDataSearchEntriesRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModDataSearchEntriesRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModDataSearchEntriesRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *ModDataSearchEntriesRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetPerpage

`func (o *ModDataSearchEntriesRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *ModDataSearchEntriesRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *ModDataSearchEntriesRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.

### HasPerpage

`func (o *ModDataSearchEntriesRequest) HasPerpage() bool`

HasPerpage returns a boolean if a field has been set.

### GetReturncontents

`func (o *ModDataSearchEntriesRequest) GetReturncontents() bool`

GetReturncontents returns the Returncontents field if non-nil, zero value otherwise.

### GetReturncontentsOk

`func (o *ModDataSearchEntriesRequest) GetReturncontentsOk() (*bool, bool)`

GetReturncontentsOk returns a tuple with the Returncontents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReturncontents

`func (o *ModDataSearchEntriesRequest) SetReturncontents(v bool)`

SetReturncontents sets Returncontents field to given value.

### HasReturncontents

`func (o *ModDataSearchEntriesRequest) HasReturncontents() bool`

HasReturncontents returns a boolean if a field has been set.

### GetSearch

`func (o *ModDataSearchEntriesRequest) GetSearch() string`

GetSearch returns the Search field if non-nil, zero value otherwise.

### GetSearchOk

`func (o *ModDataSearchEntriesRequest) GetSearchOk() (*string, bool)`

GetSearchOk returns a tuple with the Search field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearch

`func (o *ModDataSearchEntriesRequest) SetSearch(v string)`

SetSearch sets Search field to given value.

### HasSearch

`func (o *ModDataSearchEntriesRequest) HasSearch() bool`

HasSearch returns a boolean if a field has been set.

### GetSort

`func (o *ModDataSearchEntriesRequest) GetSort() int32`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *ModDataSearchEntriesRequest) GetSortOk() (*int32, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *ModDataSearchEntriesRequest) SetSort(v int32)`

SetSort sets Sort field to given value.

### HasSort

`func (o *ModDataSearchEntriesRequest) HasSort() bool`

HasSort returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


