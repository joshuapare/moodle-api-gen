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
    /// CoreFilesGetFilesRequest
    /// </summary>
    [DataContract(Name = "core_files_get_files_request")]
    public partial class CoreFilesGetFilesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreFilesGetFilesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreFilesGetFilesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreFilesGetFilesRequest" /> class.
        /// </summary>
        /// <param name="component">component (required).</param>
        /// <param name="contextid">context id Set to -1 to use contextlevel and instanceid. (required) (default to null).</param>
        /// <param name="contextlevel">The context level for the file location. (default to &quot;null&quot;).</param>
        /// <param name="filearea">file area (required) (default to &quot;null&quot;).</param>
        /// <param name="filename">file name (required) (default to &quot;null&quot;).</param>
        /// <param name="filepath">file path (required) (default to &quot;null&quot;).</param>
        /// <param name="instanceid">The instance id for where the file is located. (default to null).</param>
        /// <param name="itemid">associated id (required).</param>
        /// <param name="modified">timestamp to return files changed after this time. (default to null).</param>
        public CoreFilesGetFilesRequest(string component = default(string), int contextid = null, string contextlevel = @"null", string filearea = @"null", string filename = @"null", string filepath = @"null", int instanceid = null, int itemid = default(int), int modified = null)
        {
            // to ensure "component" is required (not null)
            if (component == null)
            {
                throw new ArgumentNullException("component is a required property for CoreFilesGetFilesRequest and cannot be null");
            }
            this.Component = component;
            this.Contextid = contextid;
            // to ensure "filearea" is required (not null)
            if (filearea == null)
            {
                throw new ArgumentNullException("filearea is a required property for CoreFilesGetFilesRequest and cannot be null");
            }
            this.Filearea = filearea;
            // to ensure "filename" is required (not null)
            if (filename == null)
            {
                throw new ArgumentNullException("filename is a required property for CoreFilesGetFilesRequest and cannot be null");
            }
            this.Filename = filename;
            // to ensure "filepath" is required (not null)
            if (filepath == null)
            {
                throw new ArgumentNullException("filepath is a required property for CoreFilesGetFilesRequest and cannot be null");
            }
            this.Filepath = filepath;
            this.Itemid = itemid;
            // use default value if no "contextlevel" provided
            this.Contextlevel = contextlevel ?? @"null";
            this.Instanceid = instanceid;
            this.Modified = modified;
        }

        /// <summary>
        /// component
        /// </summary>
        /// <value>component</value>
        [DataMember(Name = "component", IsRequired = true, EmitDefaultValue = true)]
        public string Component { get; set; }

        /// <summary>
        /// context id Set to -1 to use contextlevel and instanceid.
        /// </summary>
        /// <value>context id Set to -1 to use contextlevel and instanceid.</value>
        [DataMember(Name = "contextid", IsRequired = true, EmitDefaultValue = true)]
        public int Contextid { get; set; }

        /// <summary>
        /// The context level for the file location.
        /// </summary>
        /// <value>The context level for the file location.</value>
        [DataMember(Name = "contextlevel", EmitDefaultValue = false)]
        public string Contextlevel { get; set; }

        /// <summary>
        /// file area
        /// </summary>
        /// <value>file area</value>
        [DataMember(Name = "filearea", IsRequired = true, EmitDefaultValue = true)]
        public string Filearea { get; set; }

        /// <summary>
        /// file name
        /// </summary>
        /// <value>file name</value>
        [DataMember(Name = "filename", IsRequired = true, EmitDefaultValue = true)]
        public string Filename { get; set; }

        /// <summary>
        /// file path
        /// </summary>
        /// <value>file path</value>
        [DataMember(Name = "filepath", IsRequired = true, EmitDefaultValue = true)]
        public string Filepath { get; set; }

        /// <summary>
        /// The instance id for where the file is located.
        /// </summary>
        /// <value>The instance id for where the file is located.</value>
        [DataMember(Name = "instanceid", EmitDefaultValue = false)]
        public int Instanceid { get; set; }

        /// <summary>
        /// associated id
        /// </summary>
        /// <value>associated id</value>
        [DataMember(Name = "itemid", IsRequired = true, EmitDefaultValue = true)]
        public int Itemid { get; set; }

        /// <summary>
        /// timestamp to return files changed after this time.
        /// </summary>
        /// <value>timestamp to return files changed after this time.</value>
        [DataMember(Name = "modified", EmitDefaultValue = false)]
        public int Modified { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreFilesGetFilesRequest {\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Contextid: ").Append(Contextid).Append("\n");
            sb.Append("  Contextlevel: ").Append(Contextlevel).Append("\n");
            sb.Append("  Filearea: ").Append(Filearea).Append("\n");
            sb.Append("  Filename: ").Append(Filename).Append("\n");
            sb.Append("  Filepath: ").Append(Filepath).Append("\n");
            sb.Append("  Instanceid: ").Append(Instanceid).Append("\n");
            sb.Append("  Itemid: ").Append(Itemid).Append("\n");
            sb.Append("  Modified: ").Append(Modified).Append("\n");
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