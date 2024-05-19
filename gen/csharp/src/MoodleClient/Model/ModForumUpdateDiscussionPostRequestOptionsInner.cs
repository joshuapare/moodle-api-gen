/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// ModForumUpdateDiscussionPostRequestOptionsInner
    /// </summary>
    [DataContract(Name = "mod_forum_update_discussion_post_request_options_inner")]
    public partial class ModForumUpdateDiscussionPostRequestOptionsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumUpdateDiscussionPostRequestOptionsInner" /> class.
        /// </summary>
        /// <param name="name">The allowed keys (value format) are:                                 pinned (bool); (only for discussions) whether to pin this discussion or not                                 discussionsubscribe (bool); whether to subscribe to the post or not                                 inlineattachmentsid (int); the draft file area id for inline attachments in the text                                 attachmentsid (int); the draft file area id for attachments (default to &quot;null&quot;).</param>
        /// <param name="value">The value of the option. (default to &quot;null&quot;).</param>
        public ModForumUpdateDiscussionPostRequestOptionsInner(string name = @"null", string value = @"null")
        {
            // use default value if no "name" provided
            this.Name = name ?? @"null";
            // use default value if no "value" provided
            this.Value = value ?? @"null";
        }

        /// <summary>
        /// The allowed keys (value format) are:                                 pinned (bool); (only for discussions) whether to pin this discussion or not                                 discussionsubscribe (bool); whether to subscribe to the post or not                                 inlineattachmentsid (int); the draft file area id for inline attachments in the text                                 attachmentsid (int); the draft file area id for attachments
        /// </summary>
        /// <value>The allowed keys (value format) are:                                 pinned (bool); (only for discussions) whether to pin this discussion or not                                 discussionsubscribe (bool); whether to subscribe to the post or not                                 inlineattachmentsid (int); the draft file area id for inline attachments in the text                                 attachmentsid (int); the draft file area id for attachments</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// The value of the option.
        /// </summary>
        /// <value>The value of the option.</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumUpdateDiscussionPostRequestOptionsInner {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
