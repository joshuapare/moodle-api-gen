# ModFeedbackGetAnalysis200ResponseItemsdataInnerItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Dependitem** | **int32** | The item id this item depend on. | [default to 0]
**Dependvalue** | **string** | The depend value. | [default to "null"]
**Feedback** | **int32** | The feedback instance id this records belongs to. | [default to 0]
**Hasvalue** | **int32** | Whether it has a value or not. | [default to 0]
**Id** | **int32** | The record id. | [default to null]
**Itemfiles** | [**[]ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner**](ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md) |  | 
**Itemnumber** | **int32** | The item position number | [default to null]
**Label** | **string** | The item label. | [default to "null"]
**Name** | **string** | The item name. | [default to "null"]
**Options** | **string** | Different additional settings for the item (question). | [default to "null"]
**Otherdata** | **string** | Additional data that may be required by external functions | [default to "null"]
**Position** | **int32** | The position in the list of questions. | [default to 0]
**Presentation** | **string** | The text describing the item or the available possible answers. | [default to "null"]
**Required** | **bool** | Whether is a item (question) required or not. | [default to 0]
**Template** | **int32** | If it belogns to a template, the template id. | [default to 0]
**Typ** | **string** | The type of the item. | [default to "null"]

## Methods

### NewModFeedbackGetAnalysis200ResponseItemsdataInnerItem

`func NewModFeedbackGetAnalysis200ResponseItemsdataInnerItem(dependitem int32, dependvalue string, feedback int32, hasvalue int32, id int32, itemfiles []ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner, itemnumber int32, label string, name string, options string, otherdata string, position int32, presentation string, required bool, template int32, typ string, ) *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem`

NewModFeedbackGetAnalysis200ResponseItemsdataInnerItem instantiates a new ModFeedbackGetAnalysis200ResponseItemsdataInnerItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetAnalysis200ResponseItemsdataInnerItemWithDefaults

`func NewModFeedbackGetAnalysis200ResponseItemsdataInnerItemWithDefaults() *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem`

NewModFeedbackGetAnalysis200ResponseItemsdataInnerItemWithDefaults instantiates a new ModFeedbackGetAnalysis200ResponseItemsdataInnerItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDependitem

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetDependitem() int32`

GetDependitem returns the Dependitem field if non-nil, zero value otherwise.

### GetDependitemOk

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetDependitemOk() (*int32, bool)`

GetDependitemOk returns a tuple with the Dependitem field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDependitem

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) SetDependitem(v int32)`

SetDependitem sets Dependitem field to given value.


### GetDependvalue

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetDependvalue() string`

GetDependvalue returns the Dependvalue field if non-nil, zero value otherwise.

### GetDependvalueOk

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetDependvalueOk() (*string, bool)`

GetDependvalueOk returns a tuple with the Dependvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDependvalue

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) SetDependvalue(v string)`

SetDependvalue sets Dependvalue field to given value.


### GetFeedback

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetFeedback() int32`

GetFeedback returns the Feedback field if non-nil, zero value otherwise.

### GetFeedbackOk

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetFeedbackOk() (*int32, bool)`

GetFeedbackOk returns a tuple with the Feedback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedback

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) SetFeedback(v int32)`

SetFeedback sets Feedback field to given value.


### GetHasvalue

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetHasvalue() int32`

GetHasvalue returns the Hasvalue field if non-nil, zero value otherwise.

### GetHasvalueOk

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetHasvalueOk() (*int32, bool)`

GetHasvalueOk returns a tuple with the Hasvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasvalue

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) SetHasvalue(v int32)`

SetHasvalue sets Hasvalue field to given value.


### GetId

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) SetId(v int32)`

SetId sets Id field to given value.


### GetItemfiles

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetItemfiles() []ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner`

GetItemfiles returns the Itemfiles field if non-nil, zero value otherwise.

### GetItemfilesOk

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetItemfilesOk() (*[]ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner, bool)`

GetItemfilesOk returns a tuple with the Itemfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemfiles

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) SetItemfiles(v []ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner)`

SetItemfiles sets Itemfiles field to given value.


### GetItemnumber

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetItemnumber() int32`

GetItemnumber returns the Itemnumber field if non-nil, zero value otherwise.

### GetItemnumberOk

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetItemnumberOk() (*int32, bool)`

GetItemnumberOk returns a tuple with the Itemnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemnumber

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) SetItemnumber(v int32)`

SetItemnumber sets Itemnumber field to given value.


### GetLabel

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetLabel() string`

GetLabel returns the Label field if non-nil, zero value otherwise.

### GetLabelOk

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetLabelOk() (*string, bool)`

GetLabelOk returns a tuple with the Label field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabel

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) SetLabel(v string)`

SetLabel sets Label field to given value.


### GetName

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) SetName(v string)`

SetName sets Name field to given value.


### GetOptions

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetOptions() string`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetOptionsOk() (*string, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) SetOptions(v string)`

SetOptions sets Options field to given value.


### GetOtherdata

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetOtherdata() string`

GetOtherdata returns the Otherdata field if non-nil, zero value otherwise.

### GetOtherdataOk

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetOtherdataOk() (*string, bool)`

GetOtherdataOk returns a tuple with the Otherdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherdata

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) SetOtherdata(v string)`

SetOtherdata sets Otherdata field to given value.


### GetPosition

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetPosition() int32`

GetPosition returns the Position field if non-nil, zero value otherwise.

### GetPositionOk

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetPositionOk() (*int32, bool)`

GetPositionOk returns a tuple with the Position field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPosition

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) SetPosition(v int32)`

SetPosition sets Position field to given value.


### GetPresentation

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetPresentation() string`

GetPresentation returns the Presentation field if non-nil, zero value otherwise.

### GetPresentationOk

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetPresentationOk() (*string, bool)`

GetPresentationOk returns a tuple with the Presentation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPresentation

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) SetPresentation(v string)`

SetPresentation sets Presentation field to given value.


### GetRequired

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetRequired() bool`

GetRequired returns the Required field if non-nil, zero value otherwise.

### GetRequiredOk

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetRequiredOk() (*bool, bool)`

GetRequiredOk returns a tuple with the Required field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequired

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) SetRequired(v bool)`

SetRequired sets Required field to given value.


### GetTemplate

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetTemplate() int32`

GetTemplate returns the Template field if non-nil, zero value otherwise.

### GetTemplateOk

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetTemplateOk() (*int32, bool)`

GetTemplateOk returns a tuple with the Template field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplate

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) SetTemplate(v int32)`

SetTemplate sets Template field to given value.


### GetTyp

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetTyp() string`

GetTyp returns the Typ field if non-nil, zero value otherwise.

### GetTypOk

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) GetTypOk() (*string, bool)`

GetTypOk returns a tuple with the Typ field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTyp

`func (o *ModFeedbackGetAnalysis200ResponseItemsdataInnerItem) SetTyp(v string)`

SetTyp sets Typ field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


