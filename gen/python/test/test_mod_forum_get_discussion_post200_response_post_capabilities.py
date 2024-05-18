# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_forum_get_discussion_post200_response_post_capabilities import ModForumGetDiscussionPost200ResponsePostCapabilities

class TestModForumGetDiscussionPost200ResponsePostCapabilities(unittest.TestCase):
    """ModForumGetDiscussionPost200ResponsePostCapabilities unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModForumGetDiscussionPost200ResponsePostCapabilities:
        """Test ModForumGetDiscussionPost200ResponsePostCapabilities
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModForumGetDiscussionPost200ResponsePostCapabilities`
        """
        model = ModForumGetDiscussionPost200ResponsePostCapabilities()
        if include_optional:
            return ModForumGetDiscussionPost200ResponsePostCapabilities(
                canreplyprivately = True,
                controlreadstatus = True,
                delete = True,
                edit = True,
                export = True,
                reply = True,
                selfenrol = True,
                split = True,
                view = True
            )
        else:
            return ModForumGetDiscussionPost200ResponsePostCapabilities(
                canreplyprivately = True,
                controlreadstatus = True,
                delete = True,
                edit = True,
                export = True,
                reply = True,
                selfenrol = True,
                split = True,
                view = True,
        )
        """

    def testModForumGetDiscussionPost200ResponsePostCapabilities(self):
        """Test ModForumGetDiscussionPost200ResponsePostCapabilities"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
