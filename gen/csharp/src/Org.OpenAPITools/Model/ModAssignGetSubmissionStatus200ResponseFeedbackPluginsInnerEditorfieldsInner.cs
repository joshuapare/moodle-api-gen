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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner
    /// </summary>
    [DataContract(Name = "mod_assign_get_submission_status_200_response_feedback_plugins_inner_editorfields_inner")]
    public partial class ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner" /> class.
        /// </summary>
        /// <param name="description">field description (default to &quot;null&quot;).</param>
        /// <param name="format">text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN).</param>
        /// <param name="name">field name (default to &quot;null&quot;).</param>
        /// <param name="text">field value (default to &quot;null&quot;).</param>
        public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner(string description = @"null", int format = default(int), string name = @"null", string text = @"null")
        {
            // use default value if no "description" provided
            this.Description = description ?? @"null";
            this.Format = format;
            // use default value if no "name" provided
            this.Name = name ?? @"null";
            // use default value if no "text" provided
            this.Text = text ?? @"null";
        }

        /// <summary>
        /// field description
        /// </summary>
        /// <value>field description</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "format", EmitDefaultValue = false)]
        public int Format { get; set; }

        /// <summary>
        /// field name
        /// </summary>
        /// <value>field name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// field value
        /// </summary>
        /// <value>field value</value>
        [DataMember(Name = "text", EmitDefaultValue = false)]
        public string Text { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Format: ").Append(Format).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
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
