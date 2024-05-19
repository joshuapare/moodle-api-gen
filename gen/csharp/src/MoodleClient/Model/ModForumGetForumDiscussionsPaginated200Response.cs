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
    /// ModForumGetForumDiscussionsPaginated200Response
    /// </summary>
    [DataContract(Name = "mod_forum_get_forum_discussions_paginated_200_response")]
    public partial class ModForumGetForumDiscussionsPaginated200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumGetForumDiscussionsPaginated200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModForumGetForumDiscussionsPaginated200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumGetForumDiscussionsPaginated200Response" /> class.
        /// </summary>
        /// <param name="discussions">discussions (required).</param>
        /// <param name="warnings">warnings.</param>
        public ModForumGetForumDiscussionsPaginated200Response(List<ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner> discussions = default(List<ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner>), List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            // to ensure "discussions" is required (not null)
            if (discussions == null)
            {
                throw new ArgumentNullException("discussions is a required property for ModForumGetForumDiscussionsPaginated200Response and cannot be null");
            }
            this.Discussions = discussions;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Discussions
        /// </summary>
        [DataMember(Name = "discussions", IsRequired = true, EmitDefaultValue = true)]
        public List<ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner> Discussions { get; set; }

        /// <summary>
        /// Gets or Sets Warnings
        /// </summary>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<AuthEmailSignupUser200ResponseWarningsInner> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumGetForumDiscussionsPaginated200Response {\n");
            sb.Append("  Discussions: ").Append(Discussions).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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
