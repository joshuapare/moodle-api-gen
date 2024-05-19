# CoreBadgesGetUserBadgesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | Filter badges by course id, empty all the courses | [optional] [default to 0]
**Onlypublic** | Pointer to **bool** | Whether to return only public badges | [optional] [default to false]
**Page** | Pointer to **int32** | The page of records to return. | [optional] [default to 0]
**Perpage** | Pointer to **int32** | The number of records to return per page | [optional] [default to 0]
**Search** | Pointer to **string** | A simple string to search for | [optional] [default to ""]
**Userid** | Pointer to **int32** | Badges only for this user id, empty for current user | [optional] [default to 0]

## Methods

### NewCoreBadgesGetUserBadgesRequest

`func NewCoreBadgesGetUserBadgesRequest() *CoreBadgesGetUserBadgesRequest`

NewCoreBadgesGetUserBadgesRequest instantiates a new CoreBadgesGetUserBadgesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBadgesGetUserBadgesRequestWithDefaults

`func NewCoreBadgesGetUserBadgesRequestWithDefaults() *CoreBadgesGetUserBadgesRequest`

NewCoreBadgesGetUserBadgesRequestWithDefaults instantiates a new CoreBadgesGetUserBadgesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreBadgesGetUserBadgesRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreBadgesGetUserBadgesRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreBadgesGetUserBadgesRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreBadgesGetUserBadgesRequest) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetOnlypublic

`func (o *CoreBadgesGetUserBadgesRequest) GetOnlypublic() bool`

GetOnlypublic returns the Onlypublic field if non-nil, zero value otherwise.

### GetOnlypublicOk

`func (o *CoreBadgesGetUserBadgesRequest) GetOnlypublicOk() (*bool, bool)`

GetOnlypublicOk returns a tuple with the Onlypublic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOnlypublic

`func (o *CoreBadgesGetUserBadgesRequest) SetOnlypublic(v bool)`

SetOnlypublic sets Onlypublic field to given value.

### HasOnlypublic

`func (o *CoreBadgesGetUserBadgesRequest) HasOnlypublic() bool`

HasOnlypublic returns a boolean if a field has been set.

### GetPage

`func (o *CoreBadgesGetUserBadgesRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *CoreBadgesGetUserBadgesRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *CoreBadgesGetUserBadgesRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *CoreBadgesGetUserBadgesRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetPerpage

`func (o *CoreBadgesGetUserBadgesRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *CoreBadgesGetUserBadgesRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *CoreBadgesGetUserBadgesRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.

### HasPerpage

`func (o *CoreBadgesGetUserBadgesRequest) HasPerpage() bool`

HasPerpage returns a boolean if a field has been set.

### GetSearch

`func (o *CoreBadgesGetUserBadgesRequest) GetSearch() string`

GetSearch returns the Search field if non-nil, zero value otherwise.

### GetSearchOk

`func (o *CoreBadgesGetUserBadgesRequest) GetSearchOk() (*string, bool)`

GetSearchOk returns a tuple with the Search field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearch

`func (o *CoreBadgesGetUserBadgesRequest) SetSearch(v string)`

SetSearch sets Search field to given value.

### HasSearch

`func (o *CoreBadgesGetUserBadgesRequest) HasSearch() bool`

HasSearch returns a boolean if a field has been set.

### GetUserid

`func (o *CoreBadgesGetUserBadgesRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreBadgesGetUserBadgesRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreBadgesGetUserBadgesRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreBadgesGetUserBadgesRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


