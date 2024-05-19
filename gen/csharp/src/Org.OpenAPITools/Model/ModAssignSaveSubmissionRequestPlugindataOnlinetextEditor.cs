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
    /// ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor
    /// </summary>
    [DataContract(Name = "mod_assign_save_submission_request_plugindata_onlinetext_editor")]
    public partial class ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor" /> class.
        /// </summary>
        /// <param name="format">The format for this submission (required) (default to null).</param>
        /// <param name="itemid">The draft area id for files attached to the submission (required) (default to null).</param>
        /// <param name="text">The text for this submission. (required) (default to &quot;null&quot;).</param>
        public ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor(int format = null, int itemid = null, string text = @"null")
        {
            this.Format = format;
            this.Itemid = itemid;
            // to ensure "text" is required (not null)
            if (text == null)
            {
                throw new ArgumentNullException("text is a required property for ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor and cannot be null");
            }
            this.Text = text;
        }

        /// <summary>
        /// The format for this submission
        /// </summary>
        /// <value>The format for this submission</value>
        [DataMember(Name = "format", IsRequired = true, EmitDefaultValue = true)]
        public int Format { get; set; }

        /// <summary>
        /// The draft area id for files attached to the submission
        /// </summary>
        /// <value>The draft area id for files attached to the submission</value>
        [DataMember(Name = "itemid", IsRequired = true, EmitDefaultValue = true)]
        public int Itemid { get; set; }

        /// <summary>
        /// The text for this submission.
        /// </summary>
        /// <value>The text for this submission.</value>
        [DataMember(Name = "text", IsRequired = true, EmitDefaultValue = true)]
        public string Text { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor {\n");
            sb.Append("  Format: ").Append(Format).Append("\n");
            sb.Append("  Itemid: ").Append(Itemid).Append("\n");
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
