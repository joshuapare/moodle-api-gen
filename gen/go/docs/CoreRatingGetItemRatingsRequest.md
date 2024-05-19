# CoreRatingGetItemRatingsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | **string** | component | 
**Contextlevel** | **string** | context level: course, module, user, etc... | 
**Instanceid** | **int32** | the instance id of item associated with the context level | 
**Itemid** | **int32** | associated id | 
**Ratingarea** | **string** | rating area | 
**Scaleid** | **int32** | scale id | 
**Sort** | **string** | sort order (firstname, rating or timemodified) | [default to "null"]

## Methods

### NewCoreRatingGetItemRatingsRequest

`func NewCoreRatingGetItemRatingsRequest(component string, contextlevel string, instanceid int32, itemid int32, ratingarea string, scaleid int32, sort string, ) *CoreRatingGetItemRatingsRequest`

NewCoreRatingGetItemRatingsRequest instantiates a new CoreRatingGetItemRatingsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreRatingGetItemRatingsRequestWithDefaults

`func NewCoreRatingGetItemRatingsRequestWithDefaults() *CoreRatingGetItemRatingsRequest`

NewCoreRatingGetItemRatingsRequestWithDefaults instantiates a new CoreRatingGetItemRatingsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CoreRatingGetItemRatingsRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreRatingGetItemRatingsRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreRatingGetItemRatingsRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetContextlevel

`func (o *CoreRatingGetItemRatingsRequest) GetContextlevel() string`

GetContextlevel returns the Contextlevel field if non-nil, zero value otherwise.

### GetContextlevelOk

`func (o *CoreRatingGetItemRatingsRequest) GetContextlevelOk() (*string, bool)`

GetContextlevelOk returns a tuple with the Contextlevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextlevel

`func (o *CoreRatingGetItemRatingsRequest) SetContextlevel(v string)`

SetContextlevel sets Contextlevel field to given value.


### GetInstanceid

`func (o *CoreRatingGetItemRatingsRequest) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *CoreRatingGetItemRatingsRequest) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *CoreRatingGetItemRatingsRequest) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.


### GetItemid

`func (o *CoreRatingGetItemRatingsRequest) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreRatingGetItemRatingsRequest) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreRatingGetItemRatingsRequest) SetItemid(v int32)`

SetItemid sets Itemid field to given value.


### GetRatingarea

`func (o *CoreRatingGetItemRatingsRequest) GetRatingarea() string`

GetRatingarea returns the Ratingarea field if non-nil, zero value otherwise.

### GetRatingareaOk

`func (o *CoreRatingGetItemRatingsRequest) GetRatingareaOk() (*string, bool)`

GetRatingareaOk returns a tuple with the Ratingarea field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRatingarea

`func (o *CoreRatingGetItemRatingsRequest) SetRatingarea(v string)`

SetRatingarea sets Ratingarea field to given value.


### GetScaleid

`func (o *CoreRatingGetItemRatingsRequest) GetScaleid() int32`

GetScaleid returns the Scaleid field if non-nil, zero value otherwise.

### GetScaleidOk

`func (o *CoreRatingGetItemRatingsRequest) GetScaleidOk() (*int32, bool)`

GetScaleidOk returns a tuple with the Scaleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleid

`func (o *CoreRatingGetItemRatingsRequest) SetScaleid(v int32)`

SetScaleid sets Scaleid field to given value.


### GetSort

`func (o *CoreRatingGetItemRatingsRequest) GetSort() string`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *CoreRatingGetItemRatingsRequest) GetSortOk() (*string, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *CoreRatingGetItemRatingsRequest) SetSort(v string)`

SetSort sets Sort field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


