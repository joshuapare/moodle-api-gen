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
    /// File.
    /// </summary>
    [DataContract(Name = "core_block_get_course_blocks_200_response_blocks_inner_contents_files_inner")]
    public partial class CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner" /> class.
        /// </summary>
        /// <param name="filename">File name. (default to &quot;null&quot;).</param>
        /// <param name="filepath">File path. (default to &quot;null&quot;).</param>
        /// <param name="filesize">File size. (default to null).</param>
        /// <param name="fileurl">Downloadable file url. (default to &quot;null&quot;).</param>
        /// <param name="isexternalfile">Whether is an external file. (default to null).</param>
        /// <param name="mimetype">File mime type. (default to &quot;null&quot;).</param>
        /// <param name="repositorytype">The repository type for external files. (default to &quot;null&quot;).</param>
        /// <param name="timemodified">Time modified. (default to null).</param>
        public CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner(string filename = @"null", string filepath = @"null", int filesize = null, string fileurl = @"null", bool isexternalfile = null, string mimetype = @"null", string repositorytype = @"null", int timemodified = null)
        {
            // use default value if no "filename" provided
            this.Filename = filename ?? @"null";
            // use default value if no "filepath" provided
            this.Filepath = filepath ?? @"null";
            this.Filesize = filesize;
            // use default value if no "fileurl" provided
            this.Fileurl = fileurl ?? @"null";
            this.Isexternalfile = isexternalfile;
            // use default value if no "mimetype" provided
            this.Mimetype = mimetype ?? @"null";
            // use default value if no "repositorytype" provided
            this.Repositorytype = repositorytype ?? @"null";
            this.Timemodified = timemodified;
        }

        /// <summary>
        /// File name.
        /// </summary>
        /// <value>File name.</value>
        [DataMember(Name = "filename", EmitDefaultValue = false)]
        public string Filename { get; set; }

        /// <summary>
        /// File path.
        /// </summary>
        /// <value>File path.</value>
        [DataMember(Name = "filepath", EmitDefaultValue = false)]
        public string Filepath { get; set; }

        /// <summary>
        /// File size.
        /// </summary>
        /// <value>File size.</value>
        [DataMember(Name = "filesize", EmitDefaultValue = false)]
        public int Filesize { get; set; }

        /// <summary>
        /// Downloadable file url.
        /// </summary>
        /// <value>Downloadable file url.</value>
        [DataMember(Name = "fileurl", EmitDefaultValue = false)]
        public string Fileurl { get; set; }

        /// <summary>
        /// Whether is an external file.
        /// </summary>
        /// <value>Whether is an external file.</value>
        [DataMember(Name = "isexternalfile", EmitDefaultValue = true)]
        public bool Isexternalfile { get; set; }

        /// <summary>
        /// File mime type.
        /// </summary>
        /// <value>File mime type.</value>
        [DataMember(Name = "mimetype", EmitDefaultValue = false)]
        public string Mimetype { get; set; }

        /// <summary>
        /// The repository type for external files.
        /// </summary>
        /// <value>The repository type for external files.</value>
        [DataMember(Name = "repositorytype", EmitDefaultValue = false)]
        public string Repositorytype { get; set; }

        /// <summary>
        /// Time modified.
        /// </summary>
        /// <value>Time modified.</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner {\n");
            sb.Append("  Filename: ").Append(Filename).Append("\n");
            sb.Append("  Filepath: ").Append(Filepath).Append("\n");
            sb.Append("  Filesize: ").Append(Filesize).Append("\n");
            sb.Append("  Fileurl: ").Append(Fileurl).Append("\n");
            sb.Append("  Isexternalfile: ").Append(Isexternalfile).Append("\n");
            sb.Append("  Mimetype: ").Append(Mimetype).Append("\n");
            sb.Append("  Repositorytype: ").Append(Repositorytype).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
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
