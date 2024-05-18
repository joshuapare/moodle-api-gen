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
from typing import Any, ClassVar, Dict, List
from typing import Optional, Set
from typing_extensions import Self

class CoreCompetencyCreatePlan200ResponseCommentarea(BaseModel):
    """
    CoreCompetencyCreatePlan200ResponseCommentarea
    """ # noqa: E501
    autostart: StrictBool = Field(description="autostart")
    canpost: StrictBool = Field(description="canpost")
    canpostorhascomments: StrictBool = Field(description="canpostorhascomments")
    canview: StrictBool = Field(description="canview")
    cid: StrictStr = Field(description="cid")
    collapsediconkey: StrictStr = Field(description="collapsediconkey")
    commentarea: StrictStr = Field(description="commentarea")
    component: StrictStr = Field(description="component")
    contextid: StrictInt = Field(description="contextid")
    count: StrictInt = Field(description="count")
    courseid: StrictInt = Field(description="courseid")
    displaycancel: StrictBool = Field(description="displaycancel")
    displaytotalcount: StrictBool = Field(description="displaytotalcount")
    fullwidth: StrictBool = Field(description="fullwidth")
    itemid: StrictInt = Field(description="itemid")
    linktext: StrictStr = Field(description="linktext")
    notoggle: StrictBool = Field(description="notoggle")
    template: StrictStr = Field(description="template")
    __properties: ClassVar[List[str]] = ["autostart", "canpost", "canpostorhascomments", "canview", "cid", "collapsediconkey", "commentarea", "component", "contextid", "count", "courseid", "displaycancel", "displaytotalcount", "fullwidth", "itemid", "linktext", "notoggle", "template"]

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
        """Create an instance of CoreCompetencyCreatePlan200ResponseCommentarea from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CoreCompetencyCreatePlan200ResponseCommentarea from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "autostart": obj.get("autostart") if obj.get("autostart") is not None else False,
            "canpost": obj.get("canpost") if obj.get("canpost") is not None else False,
            "canpostorhascomments": obj.get("canpostorhascomments") if obj.get("canpostorhascomments") is not None else False,
            "canview": obj.get("canview") if obj.get("canview") is not None else False,
            "cid": obj.get("cid") if obj.get("cid") is not None else 'null',
            "collapsediconkey": obj.get("collapsediconkey") if obj.get("collapsediconkey") is not None else 'null',
            "commentarea": obj.get("commentarea") if obj.get("commentarea") is not None else 'null',
            "component": obj.get("component"),
            "contextid": obj.get("contextid"),
            "count": obj.get("count") if obj.get("count") is not None else null,
            "courseid": obj.get("courseid"),
            "displaycancel": obj.get("displaycancel") if obj.get("displaycancel") is not None else False,
            "displaytotalcount": obj.get("displaytotalcount") if obj.get("displaytotalcount") is not None else False,
            "fullwidth": obj.get("fullwidth") if obj.get("fullwidth") is not None else False,
            "itemid": obj.get("itemid") if obj.get("itemid") is not None else null,
            "linktext": obj.get("linktext") if obj.get("linktext") is not None else 'null',
            "notoggle": obj.get("notoggle") if obj.get("notoggle") is not None else False,
            "template": obj.get("template") if obj.get("template") is not None else 'null'
        })
        return _obj

