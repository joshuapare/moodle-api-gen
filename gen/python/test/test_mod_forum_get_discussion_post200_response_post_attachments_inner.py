# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_forum_get_discussion_post200_response_post_attachments_inner import ModForumGetDiscussionPost200ResponsePostAttachmentsInner

class TestModForumGetDiscussionPost200ResponsePostAttachmentsInner(unittest.TestCase):
    """ModForumGetDiscussionPost200ResponsePostAttachmentsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModForumGetDiscussionPost200ResponsePostAttachmentsInner:
        """Test ModForumGetDiscussionPost200ResponsePostAttachmentsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModForumGetDiscussionPost200ResponsePostAttachmentsInner`
        """
        model = ModForumGetDiscussionPost200ResponsePostAttachmentsInner()
        if include_optional:
            return ModForumGetDiscussionPost200ResponsePostAttachmentsInner(
                author = '',
                component = '',
                contextid = 56,
                filearea = '',
                filename = '',
                filenameshort = '',
                filepath = '',
                filesize = 56,
                filesizeformatted = '',
                html = openapi_client.models.mod_forum_get_discussion_post_200_response_post_attachments_inner_html.mod_forum_get_discussion_post_200_response_post_attachments_inner_html(
                    plagiarism = '', ),
                icon = '',
                isdir = True,
                isimage = True,
                itemid = 56,
                license = '',
                timecreated = 56,
                timecreatedformatted = '',
                timemodified = 56,
                timemodifiedformatted = '',
                url = '',
                urls = openapi_client.models.mod_forum_get_discussion_post_200_response_post_attachments_inner_urls.mod_forum_get_discussion_post_200_response_post_attachments_inner_urls(
                    export = '', )
            )
        else:
            return ModForumGetDiscussionPost200ResponsePostAttachmentsInner(
        )
        """

    def testModForumGetDiscussionPost200ResponsePostAttachmentsInner(self):
        """Test ModForumGetDiscussionPost200ResponsePostAttachmentsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
