# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.mod_feedback_get_analysis200_response_itemsdata_inner_item_itemfiles_inner import ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner
from typing import Optional, Set
from typing_extensions import Self

class ModFeedbackGetItems200ResponseItemsInner(BaseModel):
    """
    ModFeedbackGetItems200ResponseItemsInner
    """ # noqa: E501
    dependitem: Optional[StrictInt] = Field(default=0, description="The item id this item depend on.")
    dependvalue: Optional[StrictStr] = Field(default=None, description="The depend value.")
    feedback: Optional[StrictInt] = Field(default=0, description="The feedback instance id this records belongs to.")
    hasvalue: Optional[StrictInt] = Field(default=0, description="Whether it has a value or not.")
    id: Optional[StrictInt] = Field(default=None, description="The record id.")
    itemfiles: Optional[List[ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner]] = None
    itemnumber: Optional[StrictInt] = Field(default=None, description="The item position number")
    label: Optional[StrictStr] = Field(default=None, description="The item label.")
    name: Optional[StrictStr] = Field(default=None, description="The item name.")
    options: Optional[StrictStr] = Field(default=None, description="Different additional settings for the item (question).")
    otherdata: Optional[StrictStr] = Field(default=None, description="Additional data that may be required by external functions")
    position: Optional[StrictInt] = Field(default=0, description="The position in the list of questions.")
    presentation: Optional[StrictStr] = Field(default=None, description="The text describing the item or the available possible answers.")
    required: Optional[StrictBool] = Field(default=False, description="Whether is a item (question) required or not.")
    template: Optional[StrictInt] = Field(default=0, description="If it belogns to a template, the template id.")
    typ: Optional[StrictStr] = Field(default=None, description="The type of the item.")
    __properties: ClassVar[List[str]] = ["dependitem", "dependvalue", "feedback", "hasvalue", "id", "itemfiles", "itemnumber", "label", "name", "options", "otherdata", "position", "presentation", "required", "template", "typ"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of ModFeedbackGetItems200ResponseItemsInner from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in itemfiles (list)
        _items = []
        if self.itemfiles:
            for _item in self.itemfiles:
                if _item:
                    _items.append(_item.to_dict())
            _dict['itemfiles'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModFeedbackGetItems200ResponseItemsInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "dependitem": obj.get("dependitem") if obj.get("dependitem") is not None else 0,
            "dependvalue": obj.get("dependvalue"),
            "feedback": obj.get("feedback") if obj.get("feedback") is not None else 0,
            "hasvalue": obj.get("hasvalue") if obj.get("hasvalue") is not None else 0,
            "id": obj.get("id"),
            "itemfiles": [ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.from_dict(_item) for _item in obj["itemfiles"]] if obj.get("itemfiles") is not None else None,
            "itemnumber": obj.get("itemnumber"),
            "label": obj.get("label"),
            "name": obj.get("name"),
            "options": obj.get("options"),
            "otherdata": obj.get("otherdata"),
            "position": obj.get("position") if obj.get("position") is not None else 0,
            "presentation": obj.get("presentation"),
            "required": obj.get("required") if obj.get("required") is not None else False,
            "template": obj.get("template") if obj.get("template") is not None else 0,
            "typ": obj.get("typ")
        })
        return _obj

