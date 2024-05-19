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
    /// CoreFilesDeleteDraftFilesRequestFilesInner
    /// </summary>
    [DataContract(Name = "core_files_delete_draft_files_request_files_inner")]
    public partial class CoreFilesDeleteDraftFilesRequestFilesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreFilesDeleteDraftFilesRequestFilesInner" /> class.
        /// </summary>
        /// <param name="filename">Name of the file to delete. (default to &quot;null&quot;).</param>
        /// <param name="filepath">Path to the file or directory to delete. (default to &quot;null&quot;).</param>
        public CoreFilesDeleteDraftFilesRequestFilesInner(string filename = @"null", string filepath = @"null")
        {
            // use default value if no "filename" provided
            this.Filename = filename ?? @"null";
            // use default value if no "filepath" provided
            this.Filepath = filepath ?? @"null";
        }

        /// <summary>
        /// Name of the file to delete.
        /// </summary>
        /// <value>Name of the file to delete.</value>
        [DataMember(Name = "filename", EmitDefaultValue = false)]
        public string Filename { get; set; }

        /// <summary>
        /// Path to the file or directory to delete.
        /// </summary>
        /// <value>Path to the file or directory to delete.</value>
        [DataMember(Name = "filepath", EmitDefaultValue = false)]
        public string Filepath { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreFilesDeleteDraftFilesRequestFilesInner {\n");
            sb.Append("  Filename: ").Append(Filename).Append("\n");
            sb.Append("  Filepath: ").Append(Filepath).Append("\n");
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
