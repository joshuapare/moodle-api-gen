# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_forum_get_discussion_post200_response_post_tags_inner import ModForumGetDiscussionPost200ResponsePostTagsInner

class TestModForumGetDiscussionPost200ResponsePostTagsInner(unittest.TestCase):
    """ModForumGetDiscussionPost200ResponsePostTagsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModForumGetDiscussionPost200ResponsePostTagsInner:
        """Test ModForumGetDiscussionPost200ResponsePostTagsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModForumGetDiscussionPost200ResponsePostTagsInner`
        """
        model = ModForumGetDiscussionPost200ResponsePostTagsInner()
        if include_optional:
            return ModForumGetDiscussionPost200ResponsePostTagsInner(
                displayname = '',
                flag = True,
                id = 56,
                isstandard = True,
                tagid = 56,
                urls = openapi_client.models.mod_forum_get_discussion_post_200_response_post_tags_inner_urls.mod_forum_get_discussion_post_200_response_post_tags_inner_urls(
                    view = '', )
            )
        else:
            return ModForumGetDiscussionPost200ResponsePostTagsInner(
        )
        """

    def testModForumGetDiscussionPost200ResponsePostTagsInner(self):
        """Test ModForumGetDiscussionPost200ResponsePostTagsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
