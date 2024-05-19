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
    /// ModForumCanAddDiscussion200Response
    /// </summary>
    [DataContract(Name = "mod_forum_can_add_discussion_200_response")]
    public partial class ModForumCanAddDiscussion200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumCanAddDiscussion200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModForumCanAddDiscussion200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumCanAddDiscussion200Response" /> class.
        /// </summary>
        /// <param name="cancreateattachment">True if the user can add attachments, false otherwise. (default to null).</param>
        /// <param name="canpindiscussions">True if the user can pin discussions, false otherwise. (default to null).</param>
        /// <param name="status">True if the user can add discussions, false otherwise. (required) (default to null).</param>
        /// <param name="warnings">warnings.</param>
        public ModForumCanAddDiscussion200Response(bool cancreateattachment = null, bool canpindiscussions = null, bool status = null, List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            this.Status = status;
            this.Cancreateattachment = cancreateattachment;
            this.Canpindiscussions = canpindiscussions;
            this.Warnings = warnings;
        }

        /// <summary>
        /// True if the user can add attachments, false otherwise.
        /// </summary>
        /// <value>True if the user can add attachments, false otherwise.</value>
        [DataMember(Name = "cancreateattachment", EmitDefaultValue = true)]
        public bool Cancreateattachment { get; set; }

        /// <summary>
        /// True if the user can pin discussions, false otherwise.
        /// </summary>
        /// <value>True if the user can pin discussions, false otherwise.</value>
        [DataMember(Name = "canpindiscussions", EmitDefaultValue = true)]
        public bool Canpindiscussions { get; set; }

        /// <summary>
        /// True if the user can add discussions, false otherwise.
        /// </summary>
        /// <value>True if the user can add discussions, false otherwise.</value>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public bool Status { get; set; }

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
            sb.Append("class ModForumCanAddDiscussion200Response {\n");
            sb.Append("  Cancreateattachment: ").Append(Cancreateattachment).Append("\n");
            sb.Append("  Canpindiscussions: ").Append(Canpindiscussions).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
